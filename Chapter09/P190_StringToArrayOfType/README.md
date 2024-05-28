# Writing a Function<String, T> for parsing data:

Imagine a given text (test, a, 1, 4, 5, 0xf5, 0x5, 4.5d, 6, 5.6, 50000, 345, 4.0f, 6$3, 2$1.1, 5.5, 6.7, 8, a11, 3e+1,
-11199, 55). Write an application that exposes a Function<String, T> capable to parse this text and extract only
doubles, integers, longs, and so on.