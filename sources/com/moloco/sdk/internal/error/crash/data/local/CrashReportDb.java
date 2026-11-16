package com.moloco.sdk.internal.error.crash.data.local;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred
@Database
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/internal/error/crash/data/local/CrashReportDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "com/moloco/sdk/internal/error/crash/data/local/a", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public abstract class CrashReportDb extends RoomDatabase {
    public static final a a = new a();
    public static volatile CrashReportDb b;

    public abstract g c();
}
