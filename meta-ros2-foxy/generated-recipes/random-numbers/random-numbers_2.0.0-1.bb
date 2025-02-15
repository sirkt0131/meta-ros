# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "This  library contains wrappers for generating floating point values, integers, quaternions using boost libraries.    The constructor of the wrapper is guaranteed to be thread safe and initialize its random number generator to a random seed.   Seeds are obtained using a separate and different random number generator."
AUTHOR = "Anas M'chichou <anasarrak@erlerobotics.com>"
ROS_AUTHOR = "Ioan Sucan <isucan@willowgarage.edu>"
HOMEPAGE = "http://ros.org/wiki/random_numbers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "random_numbers"
ROS_BPN = "random_numbers"

ROS_BUILD_DEPENDS = " \
    boost \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/moveit/random_numbers-release/archive/release/foxy/random_numbers/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/random_numbers"
SRC_URI = "git://github.com/moveit/random_numbers-release;${ROS_BRANCH};protocol=https"
SRCREV = "0b102f1a5ff56456123d82a286c366d58a457f56"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
