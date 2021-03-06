SUMMARY = "Update management service for Open webOS"
SECTION = "webos/services"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"

DEPENDS = "luna-service2 glib-2.0 libpbnjson opkg"

inherit webos_component
inherit webos_public_repo
inherit webos_cmake
inherit webos_daemon
inherit webos_system_bus

PR = "r0"
WEBOS_COMPONENT_VERSION = "0.1.0"
PV = "${WEBOS_COMPONENT_VERSION}+gitr${SRCPV}"
WEBOS_SUBMISSION = "0"

SRCREV = "f9194af57fe4778067fa5f6dd4323ebb9ef446b2"
SRC_URI = "git://github.com/webOS-ports/${PN};branch=master;protocol=git"
S = "${WORKDIR}/git"
