package com.unity3d.services.core.misc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class JsonFlattenerRules {
    List<String> _reduceKeys;
    List<String> _skipKeys;
    List<String> _topLevelToInclude;

    public List<String> getReduceKeys() {
        return this._reduceKeys;
    }

    public List<String> getSkipKeys() {
        return this._skipKeys;
    }

    public List<String> getTopLevelToInclude() {
        return this._topLevelToInclude;
    }

    public JsonFlattenerRules(List<String> list, List<String> list2, List<String> list3) {
        this._topLevelToInclude = list;
        this._reduceKeys = list2;
        this._skipKeys = list3;
    }
}
