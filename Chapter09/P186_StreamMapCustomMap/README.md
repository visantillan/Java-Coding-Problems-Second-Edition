# Streaming custom code to map:

Imagine a class that shapes some blog posts. Each post is identified by a unique integer id and it has several
properties including its tags. The tags of each post are actually represented as a string of tags separated by
hashtag (#). Whenever we need the list of tags for a given post, we can call the allTags() helper method. Our goal is to
write a stream pipeline that extracts from this list of tags a Map<String, List<Integer>> containing for each tag (key)
the list of posts (value).