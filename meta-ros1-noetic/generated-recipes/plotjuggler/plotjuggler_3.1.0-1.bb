# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
ROS_AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
HOMEPAGE = "https://github.com/facontidavide/PlotJuggler"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPLv3"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=406b3609bd6d5a41e48fc30c8875886f"

ROS_CN = "plotjuggler"
ROS_BPN = "plotjuggler"

ROS_BUILD_DEPENDS = " \
    binutils \
    boost \
    qtbase \
    qtsvg \
    qtwebsockets \
    qtx11extras \
    roslib \
    zeromq \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    binutils \
    boost \
    qtbase \
    qtsvg \
    qtwebsockets \
    qtx11extras \
    roslib \
    zeromq \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    binutils \
    boost \
    qtbase \
    qtsvg \
    qtwebsockets \
    qtx11extras \
    roslib \
    zeromq \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/facontidavide/plotjuggler-release/archive/release/noetic/plotjuggler/3.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/plotjuggler"
SRC_URI = "git://github.com/facontidavide/plotjuggler-release;${ROS_BRANCH};protocol=https"
SRCREV = "1056f2f50baea26f95f1007d140735104d098c59"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
