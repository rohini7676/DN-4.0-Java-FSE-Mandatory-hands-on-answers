import React from 'react';

const OfficeList = () => {
  const offices = [
    {
      name: "Skyline Workspace",
      rent: 55000,
      address: "123 MG Road, Bengaluru",
      img: "https://images.unsplash.com/photo-1557804506-669a67965ba0?ixlib=rb-4.0.3&auto=format&fit=crop&w=800&q=80"
    }
  ];

  const headingStyle = { color: "darkblue", textAlign: "center", padding: "10px" };
  const renderRentColor = rent => ({ color: rent < 60000 ? "red" : "green", fontWeight: "bold" });

  return (
    <div>
      <h1 style={headingStyle}>Office Space Rental Portal</h1>
      {offices.map((office, idx) => (
        <div key={idx} style={{ 
            border: "1px solid #ccc", borderRadius: "5px", padding: "10px", 
            margin: "20px auto", width:"80%", boxShadow:"2px 2px 6px #eee" 
          }}>
          <img
            src={office.img}
            alt={office.name}
            style={{ width:"100%", maxHeight:"300px", objectFit:"cover", marginBottom:"15px" }}
          />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={renderRentColor(office.rent)}>₹{office.rent}</span>
          </p>
        </div>
      ))}
    </div>
  );
};

export default OfficeList;
