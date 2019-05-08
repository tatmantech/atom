# this is the package declaration
# the file must be saved using packagename.pm
package Shape;

# The constructor method is a Perl subroutine that returns an object
# which is an instance of the class. It is convention to name
# the constructor method ‘new’, but it can be any valid subroutine
# name. The constructor method works by using the bless function
# on a hash reference and the class name (the package name).
# When new is called, the package name ‘Shape’ is in the default
# array @_ and shift is used to take the package name from @_
# and pass it to the bless function.

# this is the constructor method
sub new { # convention to name it new
    my $class = shift; # takes the first parameter from @_ default array
    # Essentially a Perl object is a blessed reference to a hash reference
    my $self = {
        color  => 'black',
        length => 500,
        width  => 700,
    };
    # This function tells the thingy referenced by REF
    # that it is now an object in the CLASSNAME package
    return bless $self, $class;
}

1; # exit
