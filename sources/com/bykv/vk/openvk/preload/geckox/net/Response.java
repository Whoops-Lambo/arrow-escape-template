package com.bykv.vk.openvk.preload.geckox.net;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Response {
    public final String body;
    public final int code;
    public final Map<String, String> headers;
    public final String msg;

    public Response(Map<String, String> map, String str, int i, String str2) {
        this.headers = map;
        this.body = str;
        this.code = i;
        this.msg = str2;
    }
}
