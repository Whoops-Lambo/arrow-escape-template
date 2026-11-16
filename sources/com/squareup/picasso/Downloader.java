package com.squareup.picasso;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface Downloader {
    @NonNull
    Response load(@NonNull okhttp3.Request request) throws IOException;

    void shutdown();
}
