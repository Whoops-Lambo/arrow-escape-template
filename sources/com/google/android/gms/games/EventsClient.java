package com.google.android.gms.games;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface EventsClient {
    void increment(@NonNull String str, @IntRange int i);

    @NonNull
    Task<AnnotatedData<EventBuffer>> load(boolean z);

    @NonNull
    Task<AnnotatedData<EventBuffer>> loadByIds(boolean z, @NonNull String... strArr);
}
