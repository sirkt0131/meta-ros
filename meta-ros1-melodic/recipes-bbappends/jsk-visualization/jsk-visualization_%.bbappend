# Copyright (c) 2019-2020 LG Electronics, Inc.

PNBLACKLIST[jsk-visualization] ?= "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', ['qt5', 'gst-ugly'], 'Requires jsk-rqt-plugins which depends on qtbase which requires meta-qt5 to be included and depends on jsk-interactive-marker which depends on jsk-topic-tools which depends on sound-play which depends on gstreamer1.0-plugins-ugly which requires commercial license', '', d)}"
