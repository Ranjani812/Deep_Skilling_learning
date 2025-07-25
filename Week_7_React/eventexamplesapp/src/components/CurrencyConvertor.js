import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = () => {
    const euroValue = parseFloat(rupees) / 90; // Approx conversion rate
    setEuro(euroValue.toFixed(2));
  };

  return (
    <div>
      <h3>Currency Converter (INR → EURO)</h3>
      <input
        type="number"
        value={rupees}
        placeholder="Enter INR"
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euro && <p>Converted Value: €{euro}</p>}
    </div>
  );
};

export default CurrencyConvertor;
