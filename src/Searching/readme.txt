Searching Theory
================

- 2 popular ways to search thru a list (of Strings, Objects, numbers, etc):

Linear Search -> Start at 1st item move down 1 at a time until match is found
-> If no match, it won't know until it goes through the entire list

Binary Search -> Start at middle of list. If item is higher, adjust left side to midpoint + 1.
If item is lower, adjust right side to midpoint -1. Search at new midpoint and repeat until either item
is found or left and right sides collide with each other

- Binary Search can only be used if items are sorted in some way (alphabet, numeric, etc)

Objects and Searching
=====================

- Objects from Classes can be searchable if class implements Comparable:
    - public class Something implements Comparable <Something> {
- Then you decide which instance variable (property) will be used for searching/comparing purposes
- Lastly, you include a compareTo method that returns a comparison of the property with another same
type of object's same property
- compareTo returns an int so if you are comparing 2 Strings, you can use the String compareTo on that property
- For ints, you can do a calculated difference between the 2 values, or just return +1, -, or 0 depending on
which one is greater

-Then, the collection of objects you are searching through must be sorted by the compareTo property in order to
do a Binary search