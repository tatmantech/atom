use strict;
use warnings;
# enables the say function which prints and appends a newline
use feature qw/say/;
# imports Shape.pm we created with parameters
use Shape;

# create a new Shape object using variable reference
my $shape = Shape->new;

# print the shape object attributes
# use dereferencing arrow
# print using say function
print "Color is: ";
say $shape->{color};
print "Length is: ";
say $shape->{length};
print "Width is: ";
say $shape->{width};

print "adjusted length is: ";
say $shape->{length} + 1000;
print "adjusted width is: ";
say $shape->{width} + 2000;
