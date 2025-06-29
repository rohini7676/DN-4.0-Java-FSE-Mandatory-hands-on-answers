SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('==================== VIP CUSTOMER REPORT ====================');
    DBMS_OUTPUT.PUT_LINE(
        RPAD('Customer ID', 15) ||
        RPAD('Name', 20) ||
        RPAD('Balance', 15) ||
        RPAD('IsVIP', 8)
    );
    DBMS_OUTPUT.PUT_LINE('-------------------------------------------------------------');

    FOR rec IN (
        SELECT CustomerID, Name, Balance, IsVIP
        FROM Customers
        ORDER BY CustomerID
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            RPAD(rec.CustomerID, 15) ||
            RPAD(rec.Name, 20) ||
            RPAD(rec.Balance, 15) ||
            RPAD(NVL(rec.IsVIP, 'N'), 8)
        );
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('==================== END OF REPORT ====================');
END;
/
