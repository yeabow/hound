package cn.bytes1024.hound.transfers.define;

/**
 * 传输定义
 * <p>
 * 1.传输对象有多个不一样，webflux,kafka,netty ...
 * 2.具体的连接实现需要根据当前插件加载来处理实现
 * ...
 * 3.如何加载每个服务不一样的配置信息
 * </p>
 *
 * @author 江浩
 */
public interface TransferDefine {

    /**
     * 信息传输
     *
     * @param transmitObject
     */
    void transmit(TransmitObject transmitObject);


}
