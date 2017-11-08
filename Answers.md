# Answers
Results Reported:  

- Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?  
`HashMap` is meant to be more efficient than `TreeMap`. `TreeMap` has a complexity that takes a longer time to work
than `HashMap`, therefore, `HashMap` would be the preferred framework. 

- What happens if you invoke `countWords` multiple times for different String iterators?  


- What crucial role does the Iterator abstraction play in making `WordCounter` testable?  
The Iterator goes through and evaluates the data in `WordCounter` and allows more data into the map.