SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.InterestRate, c.DOB
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
    ) LOOP
        IF FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB)/12) > 60 THEN
            UPDATE Loans
            SET InterestRate = rec.InterestRate - 1
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('==================== UPDATED LOAN DETAILS ====================');
    DBMS_OUTPUT.PUT_LINE(
        RPAD('Loan ID', 12) ||
        RPAD('Customer ID', 15) ||
        RPAD('Loan Amount', 15) ||
        RPAD('Interest Rate', 15)
    );
    DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------');

    FOR rec IN (
        SELECT LoanID, CustomerID, LoanAmount, InterestRate
        FROM Loans
        ORDER BY LoanID
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            RPAD(rec.LoanID, 12) ||
            RPAD(rec.CustomerID, 15) ||
            RPAD(rec.LoanAmount, 15) ||
            RPAD(rec.InterestRate, 15)
        );
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('==================== END OF REPORT ====================');
END;
/
