require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "A small image just capable of allowing a device to boot and \
is suitable for development work."



IMAGE_INSTALL +="libanswer libanswer-exmaple"
IMAGE_FEATURES +="ssh-server-dropbear"