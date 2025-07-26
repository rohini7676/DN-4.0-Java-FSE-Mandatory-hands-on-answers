import React from "react";
import CohortDetails from "./components/CohortDetails";

const App = () => {
  const cohorts = [
    {
      name: "React Bootcamp",
      duration: "6 weeks",
      status: "ongoing"
    },
    {
      name: "Java Fundamentals",
      duration: "4 weeks",
      status: "completed"
    },
    {
      name: "Python Cohort",
      duration: "8 weeks",
      status: "ongoing"
    }
  ];

  return (
    <div>
      <h2>Cohort Dashboard</h2>
      {cohorts.map((c, index) => (
        <CohortDetails
          key={index}
          name={c.name}
          duration={c.duration}
          status={c.status}
        />
      ))}
    </div>
  );
};

export default App;
