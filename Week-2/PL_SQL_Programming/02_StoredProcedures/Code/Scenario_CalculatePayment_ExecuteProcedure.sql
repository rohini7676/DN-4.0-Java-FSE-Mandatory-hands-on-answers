SET SERVEROUTPUT ON

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_DepartmentID IN NUMBER,
    p_BonusPercent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE DepartmentID = p_DepartmentID;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_BonusPercent || '% applied to Department ID: ' || p_DepartmentID);
END;
/

BEGIN
    UpdateEmployeeBonus(10, 10);

    DBMS_OUTPUT.PUT_LINE('==================== EMPLOYEES AFTER BONUS ====================');
    DBMS_OUTPUT.PUT_LINE(RPAD('EmployeeID', 12) || RPAD('Name', 20) || RPAD('DepartmentID', 15) || RPAD('Salary', 12));
    DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------');

    FOR rec IN (SELECT * FROM Employees ORDER BY EmployeeID) LOOP
        DBMS_OUTPUT.PUT_LINE(
            RPAD(rec.EmployeeID, 12) ||
            RPAD(rec.Name, 20) ||
            RPAD(rec.DepartmentID, 15) ||
            RPAD(rec.Salary, 12)
        );
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('==================== END OF REPORT ====================');
END;
/
