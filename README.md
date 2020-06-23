# SierpinskiTriangle
A Java implementation of the algorithm to build a Sierpinski Triangle using the chaos game method.

From Wikipedia...

Sierpinski Triangle


The Sierpiński triangle (sometimes spelled Sierpinski), also called the Sierpiński gasket or Sierpiński sieve, is a fractal attractive fixed set with the overall shape of an equilateral triangle, subdivided recursively into smaller equilateral triangles. Originally constructed as a curve, this is one of the basic examples of self-similar sets—that is, it is a mathematically generated pattern that is reproducible at any magnification or reduction. It is named after the Polish mathematician Wacław Sierpiński, but appeared as a decorative pattern many centuries before the work of Sierpiński.

Chaos Game

If one takes a point and applies each of the transformations dA, dB, and dC to it randomly, the resulting points will be dense in the Sierpinski triangle, so the following algorithm will again generate arbitrarily close approximations to it:

Start by labeling p1, p2 and p3 as the corners of the Sierpinski triangle, and a random point v1. Set vn+1 = 1/2(vn + prn), where rn is a random number 1, 2 or 3. Draw the points v1 to v∞. If the first point v1 was a point on the Sierpiński triangle, then all the points vn lie on the Sierpinski triangle. If the first point v1 to lie within the perimeter of the triangle is not a point on the Sierpinski triangle, none of the points vn will lie on the Sierpinski triangle, however they will converge on the triangle. If v1 is outside the triangle, the only way vn will land on the actual triangle, is if vn is on what would be part of the triangle, if the triangle was infinitely large.
Animated construction of a Sierpinski triangle
A Sierpinski Triangle is outlined by a fractal tree with three branches forming an angle of 60° between each other. If the angle is reduced, the triangle can be continuously transformed into a fractal resembling a tree.
Each subtriangle of the nth iteration of the deterministic Sierpinski triangle has an address on a tree with n levels (if n=∞ then the tree is also a fractal); T=top/center, L=left, R=right, and these sequences can represent both the deterministic form and, "a series of moves in the chaos game"

Or more simply:

    Take three points in a plane to form a triangle, you need not draw it.
    Randomly select any point inside the triangle and consider that your current position.
    Randomly select any one of the three vertex points.
    Move half the distance from your current position to the selected vertex.
    Plot the current position.
    Repeat from step 3.

This method is also called the chaos game, and is an example of an iterated function system. You can start from any point outside or inside the triangle, and it would eventually form the Sierpinski Gasket with a few leftover points (if the starting point lies on the outline of the triangle, there are no leftover points).
