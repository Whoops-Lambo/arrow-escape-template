package com.google.android.gms.games;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface GamesMetadataClient {
    @NonNull
    @Deprecated
    Task<Game> getCurrentGame();

    @NonNull
    @Deprecated
    Task<AnnotatedData<Game>> loadGame();
}
