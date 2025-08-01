const BlogDetails = () => {
  const blogs = [
    {
      title: "React Learning",
      author: "Stephen Biz",
      desc: "Welcome to learning React!",
    },
    {
      title: "Installation",
      author: "Schewzdenier",
      desc: "You can install React from npm.",
    },
  ];

  return (
    <div className="section">
      <h2>Blog Details</h2>
      {blogs.map((blog, idx) => (
        <div key={idx}>
          <h3>{blog.title}</h3>
          <p className="subtext">{blog.author}</p>
          <p>{blog.desc}</p>
        </div>
      ))}
    </div>
  );
};

export default BlogDetails;
