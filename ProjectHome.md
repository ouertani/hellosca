Introduction :
Last week I attended to Newton (http://newton.codecauldron.org) training presented by David Savage and Mike Francis  from Paremus (http://www.paremus.com). Newton is an open source project aimed to implement SCA specification using the power of osgi inside single JVM and JINI outside it.


Goal :
Create 2 composite applications :
> composite 1 : publish a service outside the current JVM using SCA with spring DM and newton
> composite 2:  consume service.

Tools :
For this purpose I use :
- Maven 2 build tool.
- Netbeans 6.5 IDE.
- Spring DM 1.2.0 M2 (http://www.springsource.org/osgi)
- Newton  1.3.2(http://newton.codecauldron.org/site/download/release-1.3.2.html)
- Maven Felix plugin to generate bundles.