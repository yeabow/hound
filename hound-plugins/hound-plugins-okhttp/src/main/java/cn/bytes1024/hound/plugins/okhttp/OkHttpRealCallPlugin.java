package cn.bytes1024.hound.plugins.okhttp;


import cn.bytes1024.hound.plugins.define.AbstractPluginDefine;
import cn.bytes1024.hound.plugins.okhttp.interceptor.OkHttpRealCallMethodInterceptor;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class OkHttpRealCallPlugin extends AbstractPluginDefine {
    @Override
    public void init(AbstractPluginDefine.PluginDefineBuilder defineBuilder) {
        defineBuilder.pointName("plugin-okHttp-realCall")
                .pointClass(named("okhttp3.RealCall"))
                .pointMethod(named("execute")
                                .or(named("enqueue"))
                                .or(named("cancel")),
                        OkHttpRealCallMethodInterceptor.class
                );
    }
}
