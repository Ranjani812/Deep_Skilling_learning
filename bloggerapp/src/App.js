import React, { useState } from 'react';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  const [view, setView] = useState("course");

  return (
    <div className="App">
      <h1>Blogger App</h1>

      <button onClick={() => setView("course")}>Course</button>
      <button onClick={() => setView("book")}>Book</button>
      <button onClick={() => setView("blog")}>Blog</button>

      {/* Conditional Rendering */}
      {view === "course" && <CourseDetails />}
      {view === "book" && <BookDetails />}
      {view === "blog" && <BlogDetails />}
    </div>
  );
}

export default App;
