package com.orange.orangepilotserver.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ykcz
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 22:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    /**
     * 发送者
     */
    private String sender;

    /**
     * 消息内容
     */
    private String content;

}
