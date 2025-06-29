SET SERVEROUTPUT ON;

BEGIN
    DBMS_OUTPUT.PUT_LINE('==================== UPCOMING LOAN REMINDERS ====================');
    DBMS_OUTPUT.PUT_LINE(RPAD('Loan ID', 10) || RPAD('Customer Name', 25) || 'Due Date');
    DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------');

    FOR rec IN (
        SELECT l.LoanID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
        ORDER BY l.EndDate
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            RPAD(rec.LoanID, 10) ||
            RPAD(rec.Name, 25) ||
            TO_CHAR(rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('==================== END OF REMINDERS ====================');
END;
/
