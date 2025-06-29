SET SERVEROUTPUT ON

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'SAVINGS';

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/

BEGIN
    ProcessMonthlyInterest;

    DBMS_OUTPUT.PUT_LINE('==================== ACCOUNTS AFTER INTEREST ====================');
    DBMS_OUTPUT.PUT_LINE(RPAD('AccountID', 12) || RPAD('CustomerID', 15) || RPAD('AccountType', 15) || RPAD('Balance', 15));
    DBMS_OUTPUT.PUT_LINE('-----------------------------------------------------------------');

    FOR rec IN (SELECT * FROM Accounts ORDER BY AccountID) LOOP
        DBMS_OUTPUT.PUT_LINE(
            RPAD(rec.AccountID, 12) ||
            RPAD(rec.CustomerID, 15) ||
            RPAD(rec.AccountType, 15) ||
            RPAD(rec.Balance, 15)
        );
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('==================== END OF REPORT ====================');
END;
/
