package com.singular.sdk.internal;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface BatchManagerPersistence {
    boolean addEvent(String str, String str2) throws IOException;

    boolean deleteEvent(String str) throws IOException;

    Set<Map.Entry<String, String>> getAllEvents();

    long getSendId();

    long incSendId();

    boolean updateEvent(String str, String str2) throws IOException;
}
