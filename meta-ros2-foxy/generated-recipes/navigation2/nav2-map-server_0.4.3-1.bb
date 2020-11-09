# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Refactored map server for ROS2 Navigation"
AUTHOR = "Brian Wilcox <brian.wilcox@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_map_server"

ROS_BUILD_DEPENDS = " \
    graphicsmagick \
    launch-ros \
    launch-testing \
    nav-msgs \
    nav2-common \
    nav2-msgs \
    nav2-util \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
    tf2 \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    graphicsmagick \
    launch-ros \
    launch-testing \
    nav-msgs \
    nav2-msgs \
    nav2-util \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
    tf2 \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    graphicsmagick \
    launch-ros \
    launch-testing \
    nav-msgs \
    nav2-msgs \
    nav2-util \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
    tf2 \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/foxy/nav2_map_server/0.4.3-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/nav2_map_server"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "1cecf38054e38c5a6c11ce2198062b2ccecfbb59"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
