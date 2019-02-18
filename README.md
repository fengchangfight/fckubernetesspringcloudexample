# fckubernetesspringcloudexample

I have setup a very basic example for spring cloud service discovery with kubernetes. 
there are 2 services, one is fcbase, the other is fccaller, the fcbase service provide only one service that returns a pure string, the fccaller service calls that service of fcbase, that's it, both the 2 services are discovered and managed by kubernetes, just look at the pom.xml and you'll see the dependencies.

