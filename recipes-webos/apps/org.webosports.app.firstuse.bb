SUMMARY = "webOS Ports First Use application"
SECTION = "webos/apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit webos_public_repo
inherit webos_arch_indep
inherit enyojs_application
inherit cordova_application

PV = "0.2.0+gitr${SRCPV}"
PR = "r0"

SRCREV = "6e7a8b644b25212ad0f094e11bdb259c7a258505"
SRC_URI = "git://github.com/webOS-ports/${PN};protocol=git"
S = "${WORKDIR}/git"
