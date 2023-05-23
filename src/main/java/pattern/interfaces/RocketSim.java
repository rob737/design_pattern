package pattern.interfaces;
/*
* DOUBT :
*
* How can we use variable x in implementing classes?
* */


/*
* NOTES:
*
* interfaces and it's members can only be public
* */
interface RocketSim {
    int x  = 5;
    Length apogee();
    Force thrust();
}
