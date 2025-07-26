import React from "react";
import styles from "./CohortDetails.module.css";

const CohortDetails = ({ name, duration, status }) => {
  const headingStyle = {
    color: status === "ongoing" ? "green" : "blue"
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>{name}</h3>
      <dl>
        <dt>Duration:</dt>
        <dd>{duration}</dd>
        <dt>Status:</dt>
        <dd>{status}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
