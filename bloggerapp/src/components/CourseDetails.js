import React from 'react';

const CourseDetails = () => {
  const courses = [
    { name: 'Angular', date: '4/5/2021' },
    { name: 'React', date: '6/3/20201' },
    { price: 450 }
  ];

  return (
    <div>
      <h2>Course Details</h2>
      {courses.map((course, index) =>
        course.name ? (
          <div key={index}>
            <p>{course.name}</p>
            <p>{course.date}</p>
          </div>
        ) : (
          <p key={index}>Price: {course.price}</p>
        )
      )}
    </div>
  );
};

export default CourseDetails;
