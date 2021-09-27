package Pattern3.IteratorPattern;

/**
 * ������ۼ���ɫ�ࡵ
 *
 * @author vegetate
 * @create 2018/11/9 17:11
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    /**
     * ���췽��������ۺ϶���ľ�������
     */
    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {

        return new ConcreteIterator();
    }

    /**
     * �ڲ���Ա�࣬�����������
     */
    private class ConcreteIterator implements Iterator {
        //�ڲ���������¼��ǰ������������λ��
        private int index = 0;
        //��¼��ǰ�ۼ�����Ĵ�С
        private int size = 0;

        /**
         * ���캯��
         */
        public ConcreteIterator() {

            this.size = objArray.length;
            index = 0;
        }

        /**
         * ����������������ǰԪ��
         */
        @Override
        public Object currentItem() {
            return objArray[index];
        }

        /**
         * �����������ƶ�����һ��Ԫ��
         */
        @Override
        public void first() {

            index = 0;
        }

        /**
         * �����������Ƿ�Ϊ���һ��Ԫ��
         */
        @Override
        public boolean isDone() {
            return (index >= size);
        }

        /**
         * �����������ƶ�����һ��Ԫ��
         */
        @Override
        public void next() {

            if (index < size) {
                index++;
            }
        }
    }
}
