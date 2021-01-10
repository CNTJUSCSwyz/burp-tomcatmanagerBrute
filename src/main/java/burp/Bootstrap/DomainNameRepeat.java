package burp.Bootstrap;

import java.util.Map;
import java.util.HashMap;

public class DomainNameRepeat {

    private Map<String, Integer> domainNameMap;

    public DomainNameRepeat() {
        this.domainNameMap = new HashMap<String, Integer>();
    }

    public Map<String, Integer> getDomainNameMap() {
        return this.domainNameMap;
    }

    public void add(String domainName) {
        if (domainName == null || domainName.length() <= 0) {
            throw new IllegalArgumentException("��������Ϊ��");
        }

        this.getDomainNameMap().put(domainName, 1);
    }

    public void del(String domainName) {
        if (this.getDomainNameMap().get(domainName) != null) {
            this.getDomainNameMap().remove(domainName);
        }
    }

    /**
     * �ظ������ļ��
     * true  ��ʾ�ظ�
     * false ��ʾ���ظ�
     * @param domainName
     * @return boolean
     */
    public boolean check(String domainName) {
        if (this.getDomainNameMap().get(domainName) != null) {
            return true;
        }
        return false;
    }
}