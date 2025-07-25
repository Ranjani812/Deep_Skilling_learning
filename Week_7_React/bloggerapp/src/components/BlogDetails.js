import React from 'react';

const BlogDetails = () => {
  const blogs = [
    {
      title: "React Learning",
      views: 670,
      author: "Stephen Biz",
      content: "Welcome to learning React!"
    },
    {
      title: "Installation",
      views: 800,
      author: "Schewzdenier",
      content: "You can install React from npm."
    }
  ];

  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map((blog, index) =>
        blog.views > 700 ? (
          <div key={index} style={{ background: "#eee", margin: "10px", padding: "10px" }}>
            <h3>{blog.title}</h3>
            <p>{blog.author}</p>
            <p>{blog.content}</p>
            <p>Views: {blog.views}</p>
          </div>
        ) : null
      )}
    </div>
  );
};

export default BlogDetails;
