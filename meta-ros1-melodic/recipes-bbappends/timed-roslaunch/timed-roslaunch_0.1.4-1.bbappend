# Copyright (c) 2020 LG Electronics, Inc.

# ERROR: timed-roslaunch-0.1.4-1-r0 do_package_qa: QA Issue: /opt/ros/melodic/lib/timed_roslaunch/timed_roslaunch.sh contained in package timed-roslaunch requires /bin/bash, but no providers found in RDEPENDS_timed-roslaunch? [file-rdeps]
RDEPENDS_${PN} += "bash"

# Change installation path for launch files
FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-timed-roslaunch_launch_install.patch"

# This is needed only for webOS OSE and it's not in meta-ros-webos, because
# then meta-ros-webos would need to include this .bbappend just when
# meta-ros1-melodic layer is included
VIRTUAL-RUNTIME_bash ?= "bash"
RDEPENDS_${PN}_append_class-target_webos = " ${VIRTUAL-RUNTIME_bash}"
RDEPENDS_${PN}_remove_class-target_webos = "${@oe.utils.conditional('WEBOS_PREFERRED_PROVIDER_FOR_BASH', 'busybox', 'bash', '', d)}"
