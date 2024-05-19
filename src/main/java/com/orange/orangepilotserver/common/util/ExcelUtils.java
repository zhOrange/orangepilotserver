package com.orange.orangepilotserver.common.util;

import com.alibaba.excel.EasyExcel;
import com.orange.orangepilotserver.plugin.easyexcel.MyAnalysisEventListener;

import java.io.InputStream;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 20:36
 */
public class ExcelUtils {

    public static <T> String importExcel(InputStream is, Class clazz, MyAnalysisEventListener<T> listener) {
        EasyExcel.read(is, clazz, listener).sheet().doRead();
        return listener.getMsg();
    }
}
