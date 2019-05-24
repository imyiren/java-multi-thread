package io.ilss.part1.linkedHashMap;

import java.util.HashMap;

/**
 * className: LRUCache
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/10 19:37
 */
public class LRUCache {
    private Node head;

    private Node end;
    //缓存上限
    private int limit;

    private HashMap<String, Node> hashMap;

    public LRUCache(int limit) {
        this.limit = limit;
        hashMap = new HashMap<String, Node>();
    }

    synchronized public String get(String key) {
        Node node = hashMap.get(key);
        if (node == null) {
            return null;
        }
        refreshNode(node);
        return node.value;
    }

    synchronized public void put(String key, String value) {
        Node node = hashMap.get(key);
        if (node == null) {
            //如果key不存在，插入key-value
            if (hashMap.size() >= limit) {
                String oldKey = removeNode(head);
                hashMap.remove(oldKey);
            }
            node = new Node(key, value);
            addNode(node);
            hashMap.put(key,node);
        } else {
            //如果key存在，刷新key-value
            node.value = value;
            refreshNode(node);
        }
    }

    synchronized public void remove(String key) {
        Node node = hashMap.get(key);
        removeNode(node);
        hashMap.remove(key);
    }

    synchronized private void refreshNode(Node node) {
        //如果访问的是尾结点，无需移动结点
        if (node == end) {
            return;
        }
        //移动结点
        removeNode(node);
        addNode(node);
    }

    synchronized private String removeNode(Node node) {
        if (node == end) {
            //移除尾结点
            end = end.pre;
        } else if (node == head) {
            //移除头结点
            head = head.next;
        } else {
            //移除中间结点
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        return node.key;
    }

    synchronized private void addNode(Node node) {
        if (end != null) {
            end.next = node;
            node.pre = end;
            node.next = null;
        }
        end = node;
        if (head == null) {
            head = node;
        }
    }

    class Node {
        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public Node pre;
        public Node next;
        public String key;
        public String value;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put("001", "用户1信息");
        lruCache.put("002", "用户1信息");
        lruCache.put("003", "用户1信息");
        lruCache.put("004", "用户1信息");
        lruCache.put("005", "用户1信息");
        System.out.println(lruCache.get("002"));
        lruCache.put("004", "用户2信息更新");
        System.out.println(lruCache.end.key);
        lruCache.put("006", "用户6信息");
        System.out.println(lruCache.get("001"));
        System.out.println(lruCache.get("006"));
    }
}
