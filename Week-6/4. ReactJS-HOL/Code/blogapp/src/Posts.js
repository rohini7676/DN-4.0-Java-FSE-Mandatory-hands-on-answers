import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [
        {
          id: 1,
          title: 'Welcome to React!',
          body: 'This is a sample post to demonstrate how to display static data in your component.'
        },
        {
          id: 2,
          title: 'Component Lifecycle',
          body: 'This example shows data being loaded directly in the constructor, so lifecycle methods like componentDidMount are not needed for fetching.'
        },
        {
          id: 3,
          title: 'Styling Your Blog',
          body: 'You can easily style these posts by adding CSS rules in your App.css file.'
        }
      ],
      error: null,
    };
  }

  componentDidCatch(error, info) {
    alert(`Error: ${error.message}\n\n${info.componentStack}`);
    console.error('Error caught by componentDidCatch:', error, info);
  }

  render() {
    const { posts } = this.state;

    return (
      <div>
        {posts.map(post => (
          // Add className="post" to this div
          <div key={post.id} className="post">
            <h1>{post.title}</h1>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;