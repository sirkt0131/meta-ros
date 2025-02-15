# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "OpenVSLAM: A Versatile Visual SLAM Framework"
AUTHOR = "ymd-stella <world.applepie@gmail.com>"
ROS_AUTHOR = "Shinya Sumikura"
HOMEPAGE = "https://openvslam-community.readthedocs.io/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "2-clause BSD"
LICENSE = "2-clause-BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=bb3f7c490e9f9c6a35bf0ea64011b779"

ROS_CN = "openvslam"
ROS_BPN = "openvslam"

ROS_BUILD_DEPENDS = " \
    glog \
    libeigen \
    libg2o \
    opencv \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    glog \
    libeigen \
    libg2o \
    opencv \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    glog \
    libeigen \
    libg2o \
    opencv \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/OpenVSLAM-Community/openvslam-release/archive/release/foxy/openvslam/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/openvslam"
SRC_URI = "git://github.com/OpenVSLAM-Community/openvslam-release;${ROS_BRANCH};protocol=https"
SRCREV = "e83eed8abae52953f32c752a3ce226939aacc9d1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
