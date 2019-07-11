package max_07_06;

/**
 * 描述:
 * ----自定义设计一个读写锁
 *
 * @author Administrator
 * @create 2019-07-06 23:17
 *
 *      怎么实现一个读写锁？
 *          先定义读写锁的接口： 有上锁，解锁 等方法
 *          不知道怎么实现，先去看看  怎么用synchronized实现显式锁（补充synchronized无法控制阻塞时长，无法中断阻塞），
 *          Reenlock
 */
 interface ReadAndWriteLock {


    void lock();

    void unlock();


}