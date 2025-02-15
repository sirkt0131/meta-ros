# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Scripts and launch files for starting basic Leo Rover functionalities."
AUTHOR = "Błażej Sowa <blazej@turtlerover.com>"
ROS_AUTHOR = "Błażej Sowa <blazej@turtlerover.com>"
HOMEPAGE = "http://wiki.ros.org/leo_bringup"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "leo_robot"
ROS_BPN = "leo_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    leo-description \
    robot-state-publisher \
    rosbridge-server \
    rosserial-python \
    sensor-msgs \
    web-video-server \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fictionlab-gbp/leo_robot-release/archive/release/melodic/leo_bringup/1.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/leo_bringup"
SRC_URI = "git://github.com/fictionlab-gbp/leo_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "8ebb3ebe339c246aaa6d4f36bd64b6c64b2b2ac8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
