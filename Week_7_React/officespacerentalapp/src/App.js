import React from "react";
import "./App.css";

function App() {
  const officeList = [
    {
      id: 1,
      name: "Downtown Workspace",
      rent: 55000,
      address: "123 MG Road, Chennai",
      image: "https://via.placeholder.com/300x200?text=Office+1",
    },
    {
      id: 2,
      name: "TechHub Office",
      rent: 75000,
      address: "456 Anna Nagar, Chennai",
      image: "https://via.placeholder.com/300x200?text=Office+2",
    },
    {
      id: 3,
      name: "Startup Nest",
      rent: 62000,
      address: "789 T Nagar, Chennai",
      image: "https://via.placeholder.com/300x200?text=Office+3",
    },
  ];

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>
      <div className="office-list">
        {officeList.map((office) => (
          <div key={office.id} className="office-card">
            <img src={office.image} alt={office.name} />
            <h2>{office.name}</h2>
            <p>{office.address}</p>
            <p
              style={{
                color: office.rent < 60000 ? "red" : "green",
                fontWeight: "bold",
              }}
            >
              ₹ {office.rent.toLocaleString()}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
