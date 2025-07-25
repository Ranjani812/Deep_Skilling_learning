// Posts.js
import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  // Method to load posts using fetch
  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error("Failed to fetch posts");
        }
        return response.json();
      })
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        this.setState({ error: error.message });
      });
  };

  // Life cycle method
  componentDidMount() {
    this.loadPosts();
  }

  // Error boundary method
  componentDidCatch(error, info) {
    alert("An error occurred: " + error);
  }

  render() {
    const { posts, error } = this.state;
    return (
      <div>
        <h1>Blog Posts</h1>
        {error && <p style={{ color: "red" }}>{error}</p>}
        {posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
