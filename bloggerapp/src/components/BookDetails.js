import React from 'react';

const BookDetails = () => {
  const books = [
    "Master React",
    "Deep Dive into Angular 11",
    "Mongo Essentials"
  ];

  return (
    <div>
      <h2>Book Details</h2>
      {books.length > 0 ? (
        <ul>
          {books.map((book, index) => <li key={index}>{book}</li>)}
        </ul>
      ) : (
        <p>No books available</p>
      )}
    </div>
  );
};

export default BookDetails;
