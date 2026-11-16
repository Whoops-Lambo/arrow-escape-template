package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum V8 {
    VIDEO_READY("VideoReady"),
    VIDEO_COMPLETE("VideoComplete"),
    VIDEO_PLAYBACK_ERROR("VideoPlaybackError"),
    VIDEO_COMMAND_ERROR("VideoCommandError"),
    VIDEO_PLAYBACK_STATE("VideoPlaybackState"),
    VIDEO_PLAYBACK_UPDATE("VideoPlaybackUpdate"),
    VIDEO_QUARTILES_EVENT("VideoQuartilesEvent"),
    VIDEO_PLAYER_CREATED("VideoPlayerCreated"),
    VIDEO_PLAYER_POSITION_UPDATED("VideoPlayerPositionUpdated"),
    VIDEO_PLAYER_DESTROYED("VideoPlayerDestroyed"),
    VIDEO_PLAYER_ACTION_EXECUTED("VideoPlayerActionExecuted"),
    VIDEO_PLAYER_POSITION("VideoPlayerPosition"),
    VIDEO_CAN_PLAY_THROUGH("VideoCanPlayThrough"),
    VIDEO_LOADED_METADATA("VideoLoadedMetadata"),
    VIDEO_CONTAINER_POSITION("VideoContainerPosition"),
    VIDEO_VIEW_POSITION("VideoViewPosition");

    public final String a;

    V8(String str) {
        this.a = str;
    }
}
