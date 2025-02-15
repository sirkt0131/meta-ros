# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "rqt_publisher provides a GUI plugin for publishing arbitrary messages with fixed or computed field values."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dorian Scholz"
HOMEPAGE = "http://wiki.ros.org/rqt_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_publisher"
ROS_BPN = "rqt_publisher"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    python3-rospkg \
    qt-gui-py-common \
    roslib \
    rosmsg \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rqt_publisher-release/archive/release/noetic/rqt_publisher/0.4.9-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rqt_publisher"
SRC_URI = "git://github.com/ros-gbp/rqt_publisher-release;${ROS_BRANCH};protocol=https"
SRCREV = "d22d8d498bbeea66ff504040772dd4a2a412db58"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
