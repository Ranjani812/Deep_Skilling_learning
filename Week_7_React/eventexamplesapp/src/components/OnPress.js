import React from 'react';

const OnPress = () => {
  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div>
      <button onClick={handleClick}>Press Me</button>
    </div>
  );
};

export default OnPress;
